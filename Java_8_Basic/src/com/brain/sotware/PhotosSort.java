package com.brain.sotware;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhotosSort {

public static void main(String[] args) {

String input= "Hello World";
System.out.println("Result: "+ solution(input));



}

public static String solution(String input) {
String[] strArray = input.split("\\r?\\n");
List<Photos> photosList = new ArrayList<>();
String pattern = "yyyy-MM-dd hh:mm:ss";
SimpleDateFormat format = new SimpleDateFormat(pattern);
for(int i=0; i< strArray.length; i++) {
String[] splitStr = strArray[i].split(", ");
Photos photo = new Photos();
photo.setName(splitStr[0]);
photo.setCityName(splitStr[1]);
try {
photo.setDate(format.parse(splitStr[2]));
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
photosList.add(photo);
}

Map<String, List<Photos>> mapList = photosList.stream().collect(Collectors.groupingBy(Photos::getCityName()));



return null;
}

}

class Photos {

String name;

String cityName;

Date date;

/**
* @return the name
*/
public String getName() {
return name;
}

/**
* @param name the name to set
*/
public void setName(String name) {
this.name = name;
}

/**
* @return the cityName
*/
public String getCityName() {
return cityName;
}

/**
* @param cityName the cityName to set
*/
public void setCityName(String cityName) {
this.cityName = cityName;
}

/**
* @return the date
*/
public Date getDate() {
return date;
}

/**
* @param date the date to set
*/
public void setDate(Date date) {
this.date = date;
}

}

Thanks & regards,
Dinesh Kumar Rakunde
