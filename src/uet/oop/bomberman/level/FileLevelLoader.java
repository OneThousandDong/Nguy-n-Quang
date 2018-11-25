package uet.oop.bomberman.level;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.LayeredEntity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.entities.character.enemy.Balloon;
import uet.oop.bomberman.entities.character.enemy.Oneal;
import uet.oop.bomberman.entities.tile.Grass;
import uet.oop.bomberman.entities.tile.Portal;
import uet.oop.bomberman.entities.tile.Wall;
import uet.oop.bomberman.entities.tile.destroyable.Brick;
import uet.oop.bomberman.entities.tile.item.BombItem;
import uet.oop.bomberman.entities.tile.item.FlameItem;
import uet.oop.bomberman.entities.tile.item.SpeedItem;
import uet.oop.bomberman.exceptions.LoadLevelException;
import uet.oop.bomberman.graphics.Screen;
import uet.oop.bomberman.graphics.Sprite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.StringTokenizer;

public class FileLevelLoader extends LevelLoader {

	/**
	 * Ma trận chứa thông tin bản đồ, mỗi phần tử lưu giá trị kí tự đọc được
	 * từ ma trận bản đồ trong tệp cấu hình
	 */
	private static char[][] _map;
	
	public FileLevelLoader(Board board, int level) throws LoadLevelException {
		super(board, level);
	}
	
	@Override
	public void loadLevel(int level) throws LoadLevelException{
		// TODO: đọc dữ liệu từ tệp cấu hình /levels/Level{level}.txt
		// TODO: cập nhật các giá trị đọc được vào _width, _height, _level, _map
		String path = "levels/Level" + level + ".txt";
		try {
			URL absPath = FileLevelLoader.class.getResource("/" + path);

			BufferedReader in = new BufferedReader(
					new InputStreamReader(absPath.openStream()));

			String data = in.readLine();
			StringTokenizer tokens = new StringTokenizer(data);

			_level = Integer.parseInt(tokens.nextToken());
			_height = Integer.parseInt(tokens.nextToken());
			_width = Integer.parseInt(tokens.nextToken());

			_map = new char[_height][_width];

			for(int i = 0; i < _height; ++i) {
				_map[i] = in.readLine().toCharArray();
			}

			in.close();
		} catch (IOException e) {
			throw new LoadLevelException("Error loading level " + path, e);
		}
	}

	@Override
	public void createEntities()
	{
		// TODO: tạo các Entity của màn chơi
		// TODO: sau khi tạo xong, gọi _board.addEntity() để thêm Entity vào game

		// TODO: phần code mẫu ở dưới để hướng dẫn cách thêm các loại Entity vào game
		// TODO: hãy xóa nó khi hoàn thành chức năng load màn chơi từ tệp cấu hình


		for (int i = 0; i < _width; i++) {
			for (int j = 0; j < _height; j++) {
				switch (_map[j][i]) {
					case '#': {
						addWall(i,j);
						break;
					}
					case '*': {
						addBrick(i,j);
						break;
					}
					case 'x': {
						addPortal(i,j);
						break;
					}
					case 'p': {
						addBomber(i,j);
						break;
					}
					case '1': {
						addBalloon(i,j);
						break;
					}
					case '2': {
						addOneal(i,j);
						break;
					}
					case 'b': {
						addBombItem(i,j);
						break;
					}
					case 'f': {
						addFlameItem(i,j);
						break;
					}
					case 's': {
						addSpeedItem(i,j);
						break;
					}
					default: {
						addGrass(i,j);
					}
				}
			}
		}

	}

	public void addBomber(int xB, int yB) {
		_board.addCharacter( new Bomber(Coordinates.tileToPixel(xB), Coordinates.tileToPixel(yB) + Game.TILES_SIZE, _board) );
		Screen.setOffset(0, 0);
		_board.addEntity(xB + yB * _width, new Grass(xB, yB, Sprite.grass));
	}

	public void addWall(int xW, int yW) {
		_board.addEntity(xW + yW * _width, new Wall(xW , yW , Sprite.wall));
	}

	public void addBrick(int xBr, int yBr) {
		_board.addEntity(xBr + yBr * _width,
				new LayeredEntity(xBr, yBr,
						new Grass(xBr, yBr, Sprite.grass),
						new Brick(xBr, yBr, Sprite.brick)
				)
		);
	}

	public void addPortal(int xP, int yP) {
		_board.addEntity(xP + yP * _width,
				new LayeredEntity(xP , yP,
						new Grass(xP , yP , Sprite.grass),
						new Portal(xP , yP , Sprite.portal),
						new Brick(xP , yP , Sprite.brick)
				)
		);
	}

	public void addBalloon(int xBl, int yBl) {
		_board.addCharacter( new Balloon(Coordinates.tileToPixel(xBl), Coordinates.tileToPixel(yBl) + Game.TILES_SIZE, _board));
		_board.addEntity(xBl + yBl * _width, new Grass(xBl, yBl, Sprite.grass));
	}

	public void addOneal(int xO, int yO) {
		_board.addCharacter( new Oneal(Coordinates.tileToPixel(xO) , Coordinates.tileToPixel(yO) + Game.TILES_SIZE, _board));
		_board.addEntity(xO + yO * _width, new Grass(xO , yO , Sprite.grass));
	}

	public void addBombItem(int xBI, int yBI) {
		_board.addEntity(xBI + yBI * _width,
				new LayeredEntity(xBI, yBI,
						new Grass(xBI ,yBI, Sprite.grass),
						new BombItem(xBI, yBI, Sprite.powerup_bombs),
						new Brick(xBI, yBI, Sprite.brick)
				)
		);
	}

	public void addFlameItem(int xFI, int yFI) {
		_board.addEntity(xFI + yFI * _width,
				new LayeredEntity(xFI, yFI,
						new Grass(xFI ,yFI, Sprite.grass),
						new FlameItem(xFI, yFI, Sprite.powerup_flames),
						new Brick(xFI, yFI, Sprite.brick)
				)
		);
	}

	public void addSpeedItem(int xSI, int ySI) {
		_board.addEntity(xSI + ySI * _width,
				new LayeredEntity(xSI, ySI,
						new Grass(xSI ,ySI, Sprite.grass),
						new SpeedItem(xSI, ySI, Sprite.powerup_speed),
						new Brick(xSI, ySI, Sprite.brick)
				)
		);
	}
	public void addGrass(int xG, int yG) {
		_board.addEntity(xG + yG * _width, new Grass(xG , yG , Sprite.grass));
	}
}
