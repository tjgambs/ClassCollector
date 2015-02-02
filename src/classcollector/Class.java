
package classcollector;


public class Class
{
    private final String university, collegeOf, nameOfCourse, teacherOfCourse, roomNumber;
    public Class(String Uni, String College, String Name, String Teacher, String Room)
    {
        university = Uni;
        collegeOf = College;
        nameOfCourse = Name;
        teacherOfCourse = Teacher;
        roomNumber = Room;
    }
    public String getUniversity()
    {
        return university;
    }
    public String getCollegeOf() 
    {
        return collegeOf;
    }
    public String getNameOfCourse() 
    {
        return nameOfCourse;
    }
    public String getTeacherOfCourse() 
    {
        return teacherOfCourse;
    }
    public String getRoomNumber() 
    {
        return roomNumber;
    }     
}
