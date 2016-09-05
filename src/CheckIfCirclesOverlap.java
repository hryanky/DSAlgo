import java.util.ArrayList;
import java.util.List;

/*// Given
class Circle {

...

void SetColor(Color); // Possible values: Color.Red, Color.Blue

bool Intersect(Circle); // Test intersection with another circle

}

// Color all the circles to either:

// - Intersecting any other circle -&gt; Color.Red

// - Lone circle -&gt; Color.Blue

void ColorizeCircles(List&lt;Circle&gt; circles) {

// Implement here

}

Question:

1] Implement ColorizeCircles (Choose your weapon: C++, C#, Java).

2] What is the complexity of the solution?

3] Can you think of a better solution?*/
class Circle{
	float x,y;
	int radius;
	String color;
	public Circle(float x,float y) {
		this.x=x;
		this.y=y;
		
	}
}
public class CheckIfCirclesOverlap {

	public static void main(String[] args) {
		Circle c1 = new Circle(6,1);
		Circle c2 = new Circle(7, 1);
		Circle c3 = new Circle(10, 1);
		c1.radius=1;
		c2.radius=1;
		c3.radius=1;
		List<Circle> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		colorized(list);
		
		System.out.println(c1.color+ " " + c2.color + " " + c3.color);
	}
//static boolean check(List<Circle> list){
//	//assuming c1.radius gives radius of first circle and c2.radius gives radius of second circle
//	Circle c1 = list.get(0);
//	Circle c2 = list.get(1);
//	if(c1.x<c2.x && c1.y<c2.y && (c1.x+c1.radius < c2.x-c2.radius || c1.y+c1.radius < c2.y-c2.radius)){
//		return false;
//	}
//	if(c1.x<c2.x && c1.y>c2.y && (c1.x+c1.radius < c2.x-c2.radius || c1.y-c1.radius > c2.y+c2.radius)){
//			return false;
//	}
//	if(c2.x<c1.x && c2.y<c1.y && (c2.x+c2.radius < c1.x-c1.radius || c2.y+c2.radius < c1.y-c1.radius)){
//		return false;
//	}
//	if(c2.x<c1.x && c2.y<c1.y && (c2.x+c2.radius < c1.x-c1.radius || c2.y-c2.radius > c1.y+c1.radius)){
//		return false;
//	}
//	return true;
//}

static void colorized(List<Circle> circles){
	boolean checkIFAlone=false;
	int size = circles.size();
	for(int i=0;i<size;i++){
		
		while(circles.get(i).color=="RED"){
			i++;
			if(i>=size){
				return;
			}
		}
		
		Circle c1 = circles.get(i);
		checkIFAlone=false;
		for(int j=i+1;j<size;j++){
			
			Circle c2 = circles.get(j);
			
			if(c1.x<=c2.x && c1.y<=c2.y && (c1.x+c1.radius < c2.x-c2.radius || c1.y+c1.radius < c2.y-c2.radius)){
				// first circle lies to the left and bottom of the other 
			}else if(c1.x<=c2.x && c1.y>=c2.y && (c1.x+c1.radius < c2.x-c2.radius || c1.y-c1.radius > c2.y+c2.radius)){
				// first circle lies to the left but top of the other
			}else if(c2.x<=c1.x && c2.y<=c1.y && (c2.x+c2.radius < c1.x-c1.radius || c2.y+c2.radius < c1.y-c1.radius)){
				
			}else if(c2.x<=c1.x && c2.y>=c1.y && (c2.x+c2.radius < c1.x-c1.radius || c2.y-c2.radius > c1.y+c1.radius)){
				
			}else{ // none of the condition satisfies, meaning circles are intersecting
				c1.color="RED";
				c2.color="RED";
				checkIFAlone=true;
				break;
			}
			
		}
		if(checkIFAlone==false){ // if c1 doesnot intersect with any other circle
			c1.color="BLUE";
		}
		
	}

}
}
