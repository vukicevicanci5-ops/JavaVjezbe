
public interface Collidable {

		boolean intersects(Collidable other);
		void setPosition(int x , int y);
		
		int getX();
	    int getY();
	    
		String getDescription();
	}


