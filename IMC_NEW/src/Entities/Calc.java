package Entities;

public class Calc {

	private double calc;
	private String status;
	
	public Calc(double height, double weight) {
		this.calc = weight/(height * height);
		
		if (calc < 18.5)
        {
            this.status = "Under weight";
        }

        if (calc >= 18.5 && calc <= 24.9)
        {
            this.status = "Normal weight";
        }

        if (calc >= 25 && calc <= 29.9)
        {
            this.status = "Overweight";
        }

        if (calc >= 30 && calc <= 34.9)
        {
            this.status = "Obesity 1";
        }

        if (calc >= 35 && calc <= 39.9)
        {
            this.status = "Obesity 2";
        }

        if (calc >= 40 && calc > 40)
        {
            this.status = "Obesity 3";
        }
        

    }
	
	
	public double getCalc()
    {
        return this.calc;
    }

    public String getStatus()
    {
        return this.status;
    }
}
