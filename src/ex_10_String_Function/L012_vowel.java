package ex_10_String_Function;

public class L012_vowel {
    public static void main(String[] args) {
        String name="Java program to count vowels and consonants";
        int vowels=0;
       int consonants=0;
        System.out.println(name.toLowerCase());
        System.out.println(name);
        for (int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("Number of vowels:"+vowels);
        System.out.println("Number of consonants:"+consonants);

    }
}
