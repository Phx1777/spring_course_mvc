package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 characters!")
    private String name;
    @NotBlank(message = "field must not be empty!")
    private String surname;

    @Min(value = 100, message = "salary must be greater than 99")
    @Max(value = 1000000, message = "salary must be less than 1.000.001")
    private int salary;

    private String department;
    private String carBrand;

    private List<String> carBrands;

    private Map<String, String> departments;
    private String[] languages;

    private Map<String, String> languagesList;

    @Pattern(regexp = "\\d{11}", message = "phone number must be 11 digits")
    private String phoneNumber;

    @CheckEmail(value = ".com", message ="email must be end .com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Sales", "Sales");
        departments.put("HR", "HR");
        departments.put("Cat", "Cat");
        departments.put("Medicine", "Medicine");
        departments.put("Sport", "Sport");

        carBrands = new LinkedList<>();
        carBrands.add("Mercedes-Benz");
        carBrands.add("BMW");
        carBrands.add("Audi");
        carBrands.add("Rolls-Royce");

        languagesList = new HashMap<>();
        languagesList.put("EN", "English");
        languagesList.put("RU", "Russian");
        languagesList.put("KZ", "Kazakh");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(List<String> carBrands) {
        this.carBrands = carBrands;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
