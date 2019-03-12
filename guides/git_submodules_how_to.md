# How to Initialize a Git Submodule Project....
-----------------------------------------------

So Basically Whay I did, was to create two repositories in GitHub:

```
	App
	Framework
```

Take in consideration the name for each Repository since the Git Submodule should match the naming convention for an Android Module (No "." nor "-"), and no spaces since that could cause some issues for the SDK/NDK. 


## Cloning the App Repository

This is a common git clone from your App Repository. I'm using the App Repository as Root Project since this is how Android organizes the Modules

```
	git clone https://github.com/kevinvillalobosGL/android-app-git-submodules.git 
```

## Adding the Git Submodule 

Once the App repo have been cloned locally, the Framework repo can be added as a git Submodule: 

```
	cd android-app-git-submodules/
	git submodule add https://github.com/kevinvillalobosGL/android_framework.git
```

## Git Submodules Init and Update

Although the Git Submodule have been added to the App, this haven't been cloned or checkout at all, so we need to initialize the Framework Submodule or any other added submodule

```
	git submodule init
	git submodule update
```

The `init` command will initialize the submodule folder as a git repository and the `update` will pull the latest commits on the repository, the update needs to be done for every time we want to pull from the Submodule.
Note that after each `git submodule update` the branches end up in a detached state (headless), so this means that we need to checkout the branch where we want to work. (Yes, every time after a pull...) 



#THIS WOULD BE A GREAT TIME TO OPEN ANDROID STUDIO

Since Android Studio / IntelliJ have support for Git Submodules you can easily take it from there! To pull and push!

Just one more thing, after each push on a Git Submodule, you need to push the updated references on the Parent/Root...






