public class Box {
	int width, length, heigth;
	int volume;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		heigth = h;
		volume = w*l*h;
	}
	
	boolean isSameBox(Box box1, Box box2) {
		if(box1.width == box2.width && box1.length == box2.length && box1.heigth == box2.heigth)
			return true;
		else
			return false;
	}
	
}
