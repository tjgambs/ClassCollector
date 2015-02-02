
package classcollector;

import java.util.ArrayList;

public class English implements CourseTraits
{
    ArrayList<Class> English = new ArrayList();
    
    @Override
    public void addClass(Class a)
    {
        English.add(a);
    }
    @Override
    public void removeClass(String a)
    {
        for(int i = 0; i<English.size(); i++)
        {
            if(English.get(i).getNameOfCourse().equalsIgnoreCase(a)) English.remove(i);
        }
    }
    @Override
    public String printOutAllClasses()
    {
        String printMe = "";
        for (Class a : English) {
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
        return English.size();
    }

    @Override
    public String printOutSavedClasses() {
        String printMe = "";
        for (Class a : English) {
            printMe+="<University: " + a.getUniversity() + "\n";
            printMe+=">College of: " + a.getCollegeOf() +"\n";
            printMe+="?Course Name: " + a.getNameOfCourse() +"\n";
            printMe+="!Teacher: " + a.getTeacherOfCourse()+"\n";
            printMe+="@Room Number: "+a.getRoomNumber()+"\n" + "\n";
        }
        return printMe;
    }
}