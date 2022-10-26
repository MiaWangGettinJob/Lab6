/*
Lab 6
Simiao Wang
5101
Section-8
*/
public class WeightedGrade {
    private double PointTotal;
    private double EarnedPoints;
    private double AssignmentPercentage;
    private double TotalWeightedGrade;

    //method to calculate and return weighted grade
    public double getGrade(double a, double b, double c) {
        PointTotal = a;
        EarnedPoints = b;
        AssignmentPercentage = c;
        TotalWeightedGrade = EarnedPoints / PointTotal * AssignmentPercentage;
        return TotalWeightedGrade;
    }

}
