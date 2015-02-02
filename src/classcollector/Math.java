
package classcollector;

import java.util.ArrayList;

public class Math implements CourseTraits
{
    ArrayList<Class> Math = new ArrayList();
    @Override
    public void addClass(Class a)
    {
        Math.add(a);
    }
    @Override
    public void removeClass(String a)
    {
        for(int i = 0; i<Math.size(); i++)
        {
            if(Math.get(i).getNameOfCourse().equalsIgnoreCase(a)) Math.remove(i);
        }
    }
    @Override
    public String printOutAllClasses()
    {
        String printMe = "";
        for (Class a : Math) {
            printMe+="University: " + a.getUniversity() + "\n";
            printMe+="College of: " + a.getCollegeOf() +"\n";
            printMe+="Course Name: " + a.getNameOfCourse() +"\n";
            printMe+="Teacher: " + a.getTeacherOfCourse()+"\n";
            printMe+="Room Number: "+a.getRoomNumber()+"\n" + "\n";
        }
        return printMe;
    }
    @Override
    public String printOutSavedClasses()
    {
        String printMe = "";
        for (Class a : Math) {
            printMe+="<University: " + a.getUniversity() + "\n";
            printMe+=">College of: " + a.getCollegeOf() +"\n";
            printMe+="?2Course Name: " + a.getNameOfCourse() +"\n";
            printMe+="!Teacher: " + a.getTeacherOfCourse()+"\n";
            printMe+="@Room Number: "+a.getRoomNumber()+"\n" + "\n";
        }
        return printMe;
    }

    @Override
    public int amountOfClasses() 
    {
        return Math.size();
    }
}
