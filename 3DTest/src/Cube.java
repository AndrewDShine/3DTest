
public class Cube
	{
		Vector[] points;
		public Cube()
		{
			points = new Vector[8];
			fill();
		}
			
		public Vector[] getPoints()
			{
				return points;
			}
		public void setPoints(Vector[] points)
			{
				this.points = points;
			}
		
		private void fill()
		{
			points[0] = new Vector(-1, -1, -1);
			points[1] = new Vector(1, -1, -1);
			points[2] = new Vector(-1, 1, -1);
			points[3] = new Vector(1, 1, -1);
			points[4] = new Vector(-1, -1, 1);
			points[5] = new Vector(1, -1, 1);
			points[6] = new Vector(-1, 1, 1);
			points[7] = new Vector(1, 1, 1);
		}
	}
