
package com.scientechtamils.day2dayprojects;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Abhinand Krishna A
 */
public class Day2dayProjects {

    public static void main(String[] args) {
        // Get the current date in YYYY-MM-DD format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());

        // Get the current time in HH-MM-SS format
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss");
        String currentTime = timeFormat.format(new Date());

        String sourceFolder = "C:\\Users\\USER1\\Downloads";
        String targetFolder = "D:\\Datewisefiles\\" + currentDate + "_" + currentTime + "_Downloads";

        File targetDirectory = new File(targetFolder);
        if (!targetDirectory.exists()) {
            targetDirectory.mkdirs();
        }

        File[] filesToMove = new File(sourceFolder).listFiles();
        if (filesToMove != null) {
            for (File file : filesToMove) {
                file.renameTo(new File(targetFolder, file.getName()));
            }
        }

        System.out.println("Files moved to " + targetFolder);
    }

}
