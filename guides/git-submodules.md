#Git and ways to Implement Modules
-----------------------------------------

This is a bit of research on git Submodules and alternatives. 


## Git Submodules
-----------------------------------------
* [Git Real 2 - Submodules](https://app.pluralsight.com/player?course=code-school-git-real-2&author=gregg-pollack&name=4cebf5a9-1a17-4b3f-84f9-b0ef66b1223b&clip=0&mode=live)


###Pros:
	- Native Support on Android Studio/IntelliJ 

###Cons:
	- Requires more ceremonies on each Push and Pull
	- Each Git Submodule gets deathed (headless state) after aL git submodule update


## Git SubTrees
-----------------------------------------

* [alternatives-to-git-submodule-git-subtree](https://www.atlassian.com/blog/git/alternatives-to-git-submodule-git-subtree) 
* [git subtree tutorial and demo](https://www.youtube.com/watch?v=t3Qhon7burE)


###Pros:
	- Lack of Documentation 

###Cons: 
	- No IntelliJ Support


# ***VS***
-----------------------------------------

* [git-submodules-vs-git-subtrees/](https://codewinsarguments.co/2016/05/01/git-submodules-vs-git-subtrees/)


Submodules are easier to push but harder to pull – This is because they are pointers to the original repository
Subtrees are easier to pull but harder to push – This is because they are copies of the original repository


## Summary: 
-----------------------------------------
(From git-submodules-vs-git-subtrees)
 
- Is the external repository something you own yourself and are likely to push code back to? Then use a submodule. This gives you the quickest and easiest way for you to push your changes back.
- Is the external repository third party code that you are unlikely to push anything back to? Then use a subtree. This gives the advantage of not having to give people permissions to an extra repo when you are giving them access to the code base, and also reduces the chance that someone will forget to run a git submodule update.


