import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Opg25 {
    String firstName, surName, rank;
    Double salary;

    public Opg25(String firstName, String surName, String rank, Double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.rank = rank;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList<Opg25> personel = new ArrayList<>();

        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try{
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                Opg25 employee = new Opg25(input.next(), input.next(), input.next(), Double.valueOf(input.next()));
                personel.add(employee);
            }

        } catch (java.net.MalformedURLException ex){
            System.out.println("invalid URL");
            System.exit(0);

        } catch (java.io.IOException ex){
            System.out.println("I/O Errors: no such file");
            System.exit(1);
        }


        System.out.println("Total value of Assistants " + salaryAssistant(personel));
        System.out.println("Total value of associates " + salaryAssociate(personel));
        System.out.println("Total value of Professor's " + salaryProfessors(personel));
        System.out.println("Total value of everyone " + salaryFaculty(personel) + "\n\n");


        System.out.println("average value of Assistants " + (salaryAssistant(personel) / numberOfAssistants(personel)));
        System.out.println("average value of associates " + (salaryAssociate(personel) / numberOfAssociates(personel)));
        System.out.println("average value of Professor's " + (salaryProfessors(personel) / numberOfProfessors(personel)));
        System.out.println("average value of everyone " + (salaryFaculty(personel) / numberOfStaff(personel)));


    }
    public static double salaryAssistant(ArrayList<Opg25> a){
        double assistantTotal = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("assistant")){
                assistantTotal += a.get(i).salary;
            }
        }
        return assistantTotal;
    }
    public static double salaryAssociate(ArrayList<Opg25> a){
        double associateTotal = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("associate")){
                associateTotal += a.get(i).salary;
            }
        }
        return associateTotal;

    }
    public static double salaryProfessors(ArrayList<Opg25> a){
        double proffesorTotal = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("full")){
                proffesorTotal += a.get(i).salary;
            }
        }
        return proffesorTotal;
    }
    public static double salaryFaculty(ArrayList<Opg25> a){
        double facultyTotal = 0;
        for (int i = 0; i < a.size(); i++) {
                facultyTotal += a.get(i).salary;
        }
        return facultyTotal;
    }

    public static double numberOfAssistants(ArrayList<Opg25> a){
        double assistantNumber = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("assistant")){
                assistantNumber++;
            }
        }
        return assistantNumber;

    }
    public static double numberOfAssociates(ArrayList<Opg25> a){
        double associateNumber = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("associate")){
                associateNumber++;
            }
        }
        return associateNumber;

    }
    public static double numberOfProfessors(ArrayList<Opg25> a){
        double proffessorNumber = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).rank.equals("full")){
                proffessorNumber++;
            }
        }
        return proffessorNumber;
    }
    public static double numberOfStaff(ArrayList<Opg25> a){
        int facultynumber = a.size();
        return facultynumber;
    }


}
