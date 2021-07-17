package junitSuits;

public class RunnerClass {
	
	@RunWith(JUnitPlatform.class)
	@SelectPackages({"packageA" ,"packageB"})
	@IncludeTags("Sanity")
	public class RunnerClass {
	}

}
