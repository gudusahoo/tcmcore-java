import java.util.*;
class LocaleFinder
{
public static void main(String args[])
{
Locale loc[]= Locale.getAvailableLocales();
System.out.println("following locales are found");
for(int i=0;i<loc.length;i++)
System.out.println(loc[i].getLocaleExtensions());
}
}
