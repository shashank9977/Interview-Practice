package designpattern;

import java.util.ArrayList;

class page{
	// this is the class
	
}

class intropages extends page{
	
		
}

class middlepages extends page{
	
	
}

class endpages extends page{
		
}

abstract class Document{ // this is the factory class for all the other classes.
	
	ArrayList<page> pages=new ArrayList<page>();
	public Document(){		
		this.createpages();		
	}
	public abstract void createpages();	
	public ArrayList<page> Pages(){		
		 return pages;
	}	
	// creator which has the factory method which is inherited by others
}


class Report extends Document{ // concurrent creators which inherit from the creators
	@Override
	public void createpages() {
		// TODO Auto-generated method stub
		pages.add(new intropages());
		pages.add(new middlepages());
		pages.add(new endpages());	
	}	
}

class Resume extends Document{
	public void createpages() {
		// TODO Auto-generated method stub
		pages.add(new intropages());				
	}
}


public class factoryimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document report=new Report();
		Document resume=new Resume();		
		System.out.println(report.getClass().getName());		
		for(page pge :report.pages){			
			System.out.print(" "+pge.getClass().getName());			
		}		
		for(page pge :resume.pages){			
			System.out.println(" "+pge.getClass().getName());			
		}	
		//System.out.println(resume.getClass().getName());		
	}

}
