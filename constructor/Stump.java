class Stump{
	int height;
    int width;
    String color;
    String type;
    boolean isHollow;
    double weight;
    int age;
    String location;
    boolean isBurnt;
    String texture;
	
	Stump(int height,int width,String color,String type,boolean isHollow,double weight,int age,String location,boolean isBurnt,String texture)
	{
		System.out.println("height:"+this.height);
		System.out.println("width:"+this.width);
		System.out.println("color:"+this.color);
		System.out.println("type:"+this.type);
		System.out.println("isHollow:"+this.isHollow);
		System.out.println("weight:"+this.weight);
		System.out.println("age:"+this.age);
		System.out.println("location:"+this.location);
		System.out.println("isBurnt:"+this.isBurnt);
		System.out.println("texture:"+this.texture);
		
		this.height=height;
		this.width=width;
		this.color=color;
		this.type=type;
		this.isHollow=isHollow;
		this.weight=weight;
		this.age=age;
		this.location=location;
		this.isBurnt=isBurnt;
		this.texture=texture;
		System.out.println("............");
		System.out.println("height:"+height);
		System.out.println("width:"+width);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("isHollow:"+isHollow);
		System.out.println("weight:"+weight);
		System.out.println("age:"+age);
		System.out.println("location:"+location);
		System.out.println("isBurnt:"+isBurnt);
		System.out.println("texture:"+texture);
	}

}