/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author verma
 */
public class EmpDet {
    private String name;
    private String id;
    private String age;
    private String gender;
    private String date;
    private String level;
    private String team_info;
    private String  title;
    private String num;
    private String mail;
    private byte[] photo;
    private ArrayList<EmpDet> arr=new ArrayList<EmpDet>();
    
    public EmpDet addnewemp()
    {
        EmpDet emp=new EmpDet();
        arr.add(emp);
        return emp;
    }
    
    public void deleteEmp(EmpDet curr)
    {
        arr.remove(curr);
    }

    public ArrayList<EmpDet> getArr() {
        return arr;
    }

    public void setArr(ArrayList<EmpDet> arr) {
        this.arr = arr;
    }
    
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
    
    
    
    
}
