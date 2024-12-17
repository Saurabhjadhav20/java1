
public class Player {
int id;
String Name;
String Game;

public Player(int id, String name, String game) {
	super();
	this.id = id;
	Name = name;
	Game = game;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGame() {
	return Game;
}
public void setGame(String game) {
	Game = game;
}

}
