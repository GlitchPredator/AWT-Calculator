#Makefile written by @GSV at 12:37 on 01.03.2023

#Variables
COMPILER := javac 
OPENER := java
SOURCE := client.java
CLASS := client.class
EXECUTABLE := client

#Rules

#DEFAULT RULE
all:
	@echo [#GSV_MAKEFILE]: Trying to compile..
	@$(COMPILER) $(SOURCE)


#OPEN RULE
o:
	@echo [#GSV_MAKEFILE]: Trying to open..
ifneq ("$(wildcard $(CLASS))", "")
	@$(OPENER) $(EXECUTABLE)
else
	@echo [#GSV_MAKEFILE]: ERROR! [_$(CLASS)] WAS NOT FONUD!
endif

#REMOVE RULE
r:
	@echo [#GSV_MAKEFILE]: Trying to remove..
ifneq ("$(wildcard $(CLASS))", "")
	@rm -r $(CLASS)
	@echo [#GSV_MAKEFILE]: SUCCESS! [_$(CLASS)] REMOVED!
else
	@echo [#GSV_MAKEFILE]: ERROR! [_$(CLASS)] WAS NOT FOUND!
endif