
public class Illustrator {
	
		private float x;
		private float y;

	
	public Illustrator(float a, float b){
		this.x=a;
		this.y=b;
		
	}

	public class Rectangle extends Illustrator{
		
		private float H;
		private float L;
		Rectangle(float x, float y, float h, float l){
		super(x,y);
		this.H=h;
		this.L=l;
			
		}
		public float surface(){
			return this.H*this.L;
		}
	
			
	
	class Carre extends Rectangle{
		 Carre(float x, float y, float c){
			 super(x, y, c, c);
		
		}
	


	class Triangle extends Illustrator{
		public Triangle(){
			
		}
	
	
	
	public void deplacer(float dx,float dy){
		this.x+=dx;
		this.y+=dy;
	}
		

	public static void main(String[] args) {
		
		Carre c=new Carre(2,2,6);
		
	}

		
	}
	}
	}
}



