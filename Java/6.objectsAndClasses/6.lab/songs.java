package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    static class Song {

        private String songType;
        private String songName;
        private String songLength;

        public Song(String songType, String songName, String songLength) {

            this.songType = songType;
            this.songName = songName;
            this.songLength = songLength;
        }

        public String getSongType() {

            return this.songType;
        }

        public String getSongName() {

            return  this.songName;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Song> songList = new ArrayList<>();

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfSongs; i++) {

            String[] songArr = scanner.nextLine().split("_");

            Song currentSong = new Song(songArr[0], songArr[1], songArr[2]);

            songList.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {

            for (Song element : songList) {

                System.out.println(element.getSongName());
            }
        } else {

            for (Song element : songList) {

                if (element.getSongType().equals(command)) {

                    System.out.println(element.getSongName());
                }
            }
        }
    }
}
