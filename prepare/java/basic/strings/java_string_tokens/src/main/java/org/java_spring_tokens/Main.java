// https://www.hackerrank.com/challenges/java-string-tokens
package org.java_spring_tokens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String s = "He is a very very good boy, isn't he?";
//        String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ";
//        String s = ",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";
//        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
//        String s = "                        ";
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() > 0 && s.split("/[A-Za-z !,?._'@]+/").length > 0) {
            String[] splited = s.split("[ !,?._'@]+");
            System.out.println(splited.length);
            for (String t : splited) {
                System.out.println(t);
            }
        } else {
            System.out.println(s.length());
        }


        scan.close();
    }
}