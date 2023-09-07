package com.softserve.edu08.Homework.task1;

  public class Student extends Person implements Cloneable {
   private int course;

   public Student(FullName fullname, int age,int course) {
    super(fullname, age);
    this.course = course;
   }

   public int getCourse() {
    return course;
   }

   public void setCourse(int course) {
    this.course = course;
   }

   @Override
   public String activity() {
    return "I study at university";
   }

   @Override
   public String info() {

    return getFullname().getFirstName() + " "
            + getFullname().getLastName() + ", "
            + getAge() +" ," + course;
   }


   @Override
   public Student clone() {
    try {
     Student res = (Student) super.clone();
     res.setFullname(res.getFullname().clone());
     return res;
    } catch (CloneNotSupportedException e) {
     throw new AssertionError();
    }
   }

  }
