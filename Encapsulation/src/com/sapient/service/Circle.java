
package com.sapient.service;


	public class Circle {
		private double radius;
		public Circle (double radius)throws Exception{
			super();
			if(radius<=0)
				throw new Exception("radius must be greater than zero");
			this.radius=radius;
		}
	
		public double area(){
			double ar=Math.PI*radius*radius;
			return ar;
		}
		public  double perimeter(){
			double pr=Math.PI*radius*2;
			return pr;
		}

	}

