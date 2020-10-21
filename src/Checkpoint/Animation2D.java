package Checkpoint;

public class Animation2D extends Animation implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("draw");
	}
	
public int getFramerate() {
		
		
		return 24;
	}

	public static void main(String[] args) {
		
		
		
		Animation2D object = new Animation2D();
		
		object.draw();
		
		int result = object.getFramerate();
		
		System.out.println(result);
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
	}
}
