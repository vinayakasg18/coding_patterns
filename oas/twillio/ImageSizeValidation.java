package oas.twillio;

import java.util.ArrayList;
import java.util.List;

public class ImageSizeValidation {
    public static List<String> imageSizeValidation(String[][] imageUrls, String maxSize){
        
        // Unit Conversion
        long limit;
        if (maxSize.length() <= 0){
            limit = 1000000;
        }
        else{
            String unit = maxSize.substring(maxSize.length() - 2, maxSize.length());
            String mSize = maxSize.substring(0, maxSize.length() - 2);
            limit = Long.valueOf(mSize);

            if ('K' == unit.charAt(0) || 'k' == unit.charAt(0)){
                limit = limit * 1000;
            }
            else if('M' == unit.charAt(0) || 'm' == unit.charAt(0)){
                limit = limit * 1000000;
            }
            else if ('G' == unit.charAt(0) || 'g' == unit.charAt(0)){
                limit = limit * 1000000000;
            }
            else
                ;
        }

        List<String> result = new ArrayList<>();

        int len = imageUrls.length;
        int j = 0;

        while (j < len){
            if (Long.valueOf(imageUrls[j][1]) <= limit){
                List<String> temp = new ArrayList<>();
                temp.add(imageUrls[j][0]);
                temp.add("TRUE");
                result.add(temp.toString());
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(imageUrls[j][0]);
                temp.add("FALSE");
                result.add(temp.toString());
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] imageUrls = {{"abc", "10230230"}};
        String maxSize = "11KB";
        System.out.println(imageSizeValidation(imageUrls, maxSize).toString());
    }
}
