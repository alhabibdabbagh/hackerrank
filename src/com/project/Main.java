package com.project;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author habib
 * @on 25.04.2021 13:10
 */
public class Main {


    public static void main(String[] args) throws IOException {
        String newList = readFileLines("/home/habib/Desktop/habib.txt");
        System.out.println(newList);

    }

    public static String readFileLines(String filepath) throws FileNotFoundException, IOException, IOException {
        File fp = new File(filepath);
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<String> lines = new ArrayList<>();
        String line;
        String line1="";
        while ((line = br.readLine()) != null ) {
             String[] hh=line.split(";");
line1 +=hh[0]+"\n" ;
        }

        fr.close();
        return line1;
    }







      /*  Scanner s = new Scanner(System.in);


    /*  *//*   Person s3 = new Person("habib", 36, Gender.MALE);
        Person s1 = new Person("habib", 37, Gender.MALE);
        Person s2 = new Person("hasan", 38, Gender.MALE);
        Person s4 = new Person("huseyin", 38, Gender.MALE);
        Person s5 = new Person("catay", 37, Gender.MALE);
        Person s6 = new Person("fatma", 46, Gender.FEMALE);
        Person s7 = new Person("sema", 46, Gender.FEMALE);
        Person s8 = new Person("fatma", 47, Gender.FEMALE);
        Person s0 = new Person("dilan", 48, Gender.FEMALE);
        Person s9 = new Person("sema", 49, Gender.FEMALE);
        List<Person> people = new ArrayList<>();
        people.add(s0);
        people.add(s1);
        people.add(s2);
        people.add(s3);
        people.add(s4);
        people.add(s5);
        people.add(s6);
        people.add(s7);
        people.add(s8);
        people.add(s9);
*//*
        List<Person> people = getPeople();
        List<Person> male = new ArrayList<>();

*//*        for (Person ss: people){
            if(ss.getGender().equals(Gender.MALE)){
                male.add(ss);
            }
        }
    for (Person oo : male){
          System.out.print(oo.getName()+" ");
          System.out.print(oo.getAge()+" ");
          System.out.println(oo.getGender());
      }
 male.forEach(System.out::println);*//*

        List<Person> myList = people.stream().filter(habib -> habib.getGender().equals(Gender.MALE)).collect(Collectors.toList());

        // myList.forEach(System.out::println);

        // sorted
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        //   sorted.forEach(System.out::println);


        // sorted reverse
        List<Person> sortedReverse = people.stream()
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getGender).reversed()).collect(Collectors.toList());
        //  sortedReverse.forEach(System.out::println);

        // allMatch boolean bir değer döndürüyor , stream altında .allmatch (konşulu yazıcaksınız ) YANİ BURADA LİST DONDURMUYOR
        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 40);
        //    System.out.println(allMatch);

        // anyMatch  yine allMatch gibi tek farkı eger bir tane koşulu saglıyrsa  true donduracaktır
        boolean anyMatch = people.stream().anyMatch(person -> person.getAge() > 40);
        // System.out.println(anyMatch);

        // eger bu sartı kinmse sağlanmıyorsa o zaman true dondurur
        boolean noneMatch = people.stream().noneMatch(person -> person.getAge() > 40);
        //  System.out.println(noneMatch);

        people.stream().max(Comparator.comparing(Person::getAge));
        people.stream().min(Comparator.comparing(Person::getAge));
 */

 /*       String[] habib = {"1", "h", "3", "4", "5", null, "null", " ", ""};
        Stream<String> s = Stream.of(habib); // böyle bir stream tanımlaması da olurmus
        *//*s.filter(Objects::nonNull).map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));*//*
      //  System.out.println(sonuc());

        List<Integer> oo =Arrays.asList(1 ,3,5,7,9,6,8,10,55,3,9,7,12,16);
        Optional <Integer> hh= oo.stream().filter(controlNumber -> controlNumber % 2 ==0).findFirst();
       // System.out.println(hh);
*/


    /*  private static List<Person> getPeople() {
          return List.of(
                  new Person("habib", 36, Gender.MALE),
                  new Person("habib", 37, Gender.MALE),
                  new Person("hasan", 38, Gender.MALE),
                  new Person("huseyin", 38, Gender.MALE),
                  new Person("catay", 37, Gender.MALE),
                  new Person("fatma", 46, Gender.FEMALE),
                  new Person("sema", 46, Gender.FEMALE),
                  new Person("fatma", 47, Gender.FEMALE),
                  new Person("dilan", 48, Gender.FEMALE),
                  new Person("sema", 49, Gender.FEMALE)
          );
      }
  */
    public static long sonuc() {
        List<Long> kutuAdadi = new ArrayList<>();
        List<Long> birimler = new ArrayList<>();
        long kapsite = 0L;
        kutuAdadi.add(1L);
        kutuAdadi.add(2L);
        kutuAdadi.add(3L);
        kutuAdadi.add(4L);
        birimler.add(1L);
        birimler.add(2L);
        birimler.add(3L);
        birimler.add(4L);
        kapsite = 5L;
        List<Long> birimlerCopya = new ArrayList<>();
        birimlerCopya = kutuAdadi;
        long birimMax = 0L;
        birimMax = Collections.max(birimlerCopya);
        int kutuNumarasi = 0;
        int conut = 0;
/*        birimler.forEach(s ->{
            if (birimler.get((int)s.longValue()).equals(birimMax)) {
                conut++;
                kutuNumarasi = ;
            }
        });*/
        for (int i = 0; i < birimler.size(); i++) {
            if (birimler.get(i).equals(birimMax)) {
                conut++;
                kutuNumarasi = i;
            }
        }
        if (kutuAdadi.get(kutuNumarasi) >= kapsite) {
            return kapsite * birimMax;
        } else {
            for (int i = 0; i < kapsite - kutuAdadi.get(kutuNumarasi); i++) {

            }
            return 0L;
        }


    }
}
