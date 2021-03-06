/**
 * Created by Rita on 2016.12.05..
 */
public class Hero extends Character {


    public Hero() {
        this("hero-down.png", 0, 0);
    }

    public Hero(String filename, int posX, int posY) {
        super("hero-down.png", posX, posY);
        int d6 = random.nextInt(6) + 1;
        maxHealthPoint = 20 + 3 * d6;
        currentHealthPoint = 20 + 3 * d6;
        defendPoint = 2 * d6;
        strikePoint = 1 + d6;
        name = "Superhero";
    }

    @Override
    public boolean isAtTheSamePlace(Hero hero) {
        return false;
    }


    public void move(int posX, int posY, boolean[][] map) {
        int newPosY = this.posY + posY;
        int newPosX = this.posX + posX;
        if (newPosY < 0 || newPosY == 10 ||
                newPosX < 0 || newPosX == 10) {
        } else if (map[newPosX][newPosY]) {
        } else {
            this.posY += posY;
            this.posX += posX;
        }
    }
}




