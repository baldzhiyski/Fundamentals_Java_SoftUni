import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static class Song{
        String typeList;
        String name ;
        String time;

        public Song(String typeList,String name , String time){
            this.typeList=typeList;
            this.name=name;
            this.time= time;

        }
        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int numSongs = Integer.parseInt(scan.nextLine());
        List<Song> songsList =new ArrayList<>();
        for (int i = 1; i <=numSongs ; i++) {
            String inputLine = scan.nextLine();
            String[] songsArr =inputLine.split("_");

            String typeList = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];

            Song currentSong = new Song(typeList,name,time);
            songsList.add(currentSong);
        }
        String command = scan.nextLine();
        if(command.equals("all")){
            for (Song song :songsList) {
                System.out.println(song.getName());
            }
        }else{
            for (Song song:songsList) {
                String currentTypeList = song.getTypeList();
                if(currentTypeList.equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
