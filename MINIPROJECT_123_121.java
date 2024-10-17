import java.util.ArrayList;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private String summary;
    private ArrayList<String> education = new ArrayList<>();
    private ArrayList<String> experience = new ArrayList<>();
    private ArrayList<String> skills = new ArrayList<>();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public ArrayList<String> getEducation() { return education; }
    public ArrayList<String> getExperience() { return experience; }
    public ArrayList<String> getSkills() { return skills; }

    public void addEducation(String edu) { education.add(edu); }
    public void addExperience(String exp) { experience.add(exp); }
    public void addSkills(String skill) { skills.add(skill); }

    public void displayResume() {
        System.out.println("========== RESUME ==========");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("\nSummary:");
        System.out.println(summary);
        System.out.println("\nEducation:");
        for (String edu : education) {
            System.out.println("- " + edu);
        }
        System.out.println("\nExperience:");
        for (String exp : experience) {
            System.out.println("- " + exp);
        }
        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
        System.out.println("============================");
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resume resume = new Resume();

        System.out.print("Enter your name: ");
        resume.setName(scanner.nextLine());

        System.out.print("Enter your email: ");
        resume.setEmail(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        resume.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter a brief summary about yourself: ");
        resume.setSummary(scanner.nextLine());

        System.out.print("How many education entries do you want to add? ");
        int eduCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < eduCount; i++) {
            System.out.print("Enter your education detail #" + (i + 1) + ": ");
            resume.addEducation(scanner.nextLine());
        }

        System.out.print("How many experience entries do you want to add? ");
        int expCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < expCount; i++) {
            System.out.print("Enter your experience detail #" + (i + 1) + ": ");
            resume.addExperience(scanner.nextLine());
        }

        System.out.print("How many skills do you want to add? ");
        int skillCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < skillCount; i++) {
            System.out.print("Enter your skill #" + (i + 1) + ": ");
            resume.addSkills(scanner.nextLine());
        }

        resume.displayResume();
        scanner.close();
    }
}
