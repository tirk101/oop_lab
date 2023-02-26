import java.util.Date;

abstract class GeometricObject{
	private String color;
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject(){
		this.color = "Black";
		this.filled = false;
		this.dateCreated = new Date();
	}

	protected GeometricObject(String color,boolean filled){
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setFilled(){
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public boolean isFilled(){
		return filled;
	}

	public Date getDate(){
		return dateCreated;
	}

	abstract public double getArea();
	abstract public double getPerimeter();

	@Override
	public String toString(){
		return "\nColor: "+color+"\nFilled: "+filled;
	}
}
