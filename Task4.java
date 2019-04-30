// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {

        int music = 0;
        int images = 0;
        int movies = 0;
        int other = 0;

        // break string per line
        String[] lines = S.split("\\r\\n|\\n|\\r");

        for (int i = 0; i < lines.length; i++) {
            // break string into file name and size
            String fileName = lines[i].split("\\s+")[0];

            // extract file size as an integer
            String fileSizeBytes = lines[i].split("\\s+")[1];
            String fileSizeWoBytes = fileSizeBytes.substring(0, fileSizeBytes.length() - 1);
            int fileSize = Integer.parseInt(fileSizeWoBytes);

            // find out what kind of file it is
            // splitting here is a bit different because some file names may contain dots
            String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);

            if (fileType.equals("mp3") || fileType.equals("flac") || fileType.equals("aac")) {
                music += fileSize;
            } else if (fileType.equals("jpg") || fileType.equals("bmp") || fileType.equals("gif")) {
                images += fileSize;
            }

            else if (fileType.equals("mp4") || fileType.equals("avi") || fileType.equals("mkv")) {
                movies += fileSize;
            } else {
                other += fileSize;
            }
        }

        return "music " + music + "b" + "\n" + "images " + images + "b" + "\n" + "movies " + movies + "b" + "\n"
                + "other " + other + "b";
    }
}