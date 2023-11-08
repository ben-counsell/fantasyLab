package Rooms;

import NPCs.EnemyCreature;
import Players.Player;

import java.util.ArrayList;

public class Room {
    private int roomId;
    private EnemyCreature enemy;
    private Chest treasureChest;
    private ArrayList<Player> players;

    public Room(int roomId, EnemyCreature enemy, Chest treasureChest) {
        this.roomId = roomId;
        this.enemy = enemy;
        this.treasureChest = treasureChest;
        this.players = new ArrayList<>();
    }

    public int getRoomId() {
        return roomId;
    }

    public EnemyCreature getEnemy() {
        return enemy;
    }

    public Chest getTreasureChest() {
        return treasureChest;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer (Player player) {
        this.players.add(player);
    }
}
