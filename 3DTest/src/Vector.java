
public class Vector
	{
		int x;
		int y;
		int z;
		double r;
		double o;
		double p;
		
		public Vector(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
			updateTypes(true);
		}
		public Vector(double r, double o, double p)
		{
			this.r = r;
			this.o = o;
			this.p = p;
			updateTypes(false);
		}
		
		public int getX()
			{
				return x;
			}
		public void setX(int x)
			{
				this.x = x;
				updateTypes(true);
			}
		public int getY()
			{
				return y;
			}
		public void setY(int y)
			{
				this.y = y;
				updateTypes(true);
			}
		public int getZ()
			{
				return z;
			}
		public void setZ(int z)
			{
				this.z = z;
				updateTypes(true);
			}
		public double getR()
			{
				return r;
			}
		public void setR(double r)
			{
				this.r = r;
				updateTypes(false);
			}
		public double getO()
			{
				return o;
			}
		public void setO(double o)
			{
				this.o = o;
				updateTypes(false);
			}
		public double getP()
			{
				return p;
			}
		public void setP(double p)
			{
				this.p = p;
				updateTypes(false);
			}
		
		private void updateTypes(boolean isXYZ)
		{
			if(isXYZ)
				{
					double magnitude = Math.sqrt((Math.pow((double) x, 2)) + (Math.pow((double) y, 2)) + (Math.pow((double) z, 2)));
					double theta = ((double) z) / r;
					theta = Math.acos(theta);
					double phi = Math.atan2((double) y, (double) x);
					r = magnitude;
					o = theta;
					p = phi;
				}
			else
				{
					double newX = (r * Math.sin(o) * Math.cos(p));
					double newY = (r * Math.sin(o) * Math.sin(p));
					double newZ = (r * Math.cos(o));
					x = (int) Math.round(newX);
					y = (int) Math.round(newY);
					z = (int) Math.round(newZ);
				}
		}
		public void addVects(Vector v1)
		{
			setR(Math.sqrt(Math.pow(r, 2) + Math.pow(v1.getR(), 2) + (2*r*v1.getR() * Math.cos(o - v1.getO()))));
			setO(o + Math.atan2(v1.getR() * Math.sin(v1.getO() - o), r + v1.getR() * Math.cos(v1.getO() - o)));
		}
		
	}
