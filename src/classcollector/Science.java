
package classcollector;

import java.util.ArrayList;

public class Science implements CourseTraits
{
    ArrayList<Class> Science = new ArrayList();
    
    @Override
    public void addClass(Class a)
    {
        Science.add(a);
    }
    @Override
    public void removeClass(String a)
    {
        for(int i = 0; i<Science.size(); i++)
        {
            if(Science.get(i).getNameOfCourse().equalsIgnoreCase(a)) Science.remove(i);
        }
    }
    @Override
    public String printOutAllClasses()
    {
        String printMe = "";
        for (Class a : Science) {
            printMe+="University: " + a.getUniversity() + "\n";
            printMe+="College of: " + a.getCollegeOf() +"\n";
            printMe+="Course Name: " + a.getNameOfCourse() +"\n";
            printMe+="Teacher: " + a.getTeacherOfCourse()+"\n";
            printMe+="Room Number: "+a.getRoomNumber()+"\n" + "\n";
        }
        return printMe;
    }

    @Override
    public int amountOfClasses() 
    {
        return Science.size();
    }

    @Override
    public String printOutSavedClasses() 
    {
        String printMe = "";
        for (Class a : Science) {
            printMe+="<University: " + a.getUniversity() + "\n";
            printMe+=">College of: " + a.getCollegeOf() +"\n";
            printMe+="?Course Name: " + a.getNameOfCourse() +"\n";
            printMe+="!Teacher: " + a.getTeacherOfCourse()+"\n";
            printMe+="@Room Number: "+a.getRoomNumber()+"\n" + "\n";
        }
        return printMe;
    }
}
