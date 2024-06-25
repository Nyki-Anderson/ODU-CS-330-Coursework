MAINPROG=<FINAL_EXECUTABLE_NAME>

SOURCES:=$(wildcard *.cpp)
OBJECTS=$(SOURCES:.cpp=.o)
FLAGS=-std=c++17 -fsanitize=leak,address -Wall -Wpedantic -fuse-ld=gold

all: $(SOURCES) $(OBJECTS)

$(MAINPROG): $(OBJECTS)
		g++ $(FLAGS) $(OBJECTS) -o $@

.cpp.o:
		g++ $(FLAGS) -c $< -o $@

clean:
		rm *.o $(MAINPROG)