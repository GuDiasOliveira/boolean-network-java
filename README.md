# Boolean Network

This is a program that you can input a boolean network, with its genes count, number of params, functions and j-params. Then you can visualize you network graphically

## Input format

	# Comment lines are ignored
	[n] [k]
	functions:
		[function-1]
		[function-2]
		...
		[function-n]
	params:
		[j-params-1]
		[j-params-2]
		...
		[j-params-n]

**Where:**
- `n` is the boolean state length;
- `k` is the number of params;
- `[function-i]` is the i'th function with a sequence of 0's an 1's separated by whitespaces;
- `[j-params-i]` is the params for the i-th function with a sequence of one-based gene indexes separated by whitespaces.

**Requirements:**
- There must be `n` functions and j-params;
- Each function must have **2<sup>k</sup>** arguments;
- Each j-params must have `k` arguments.

There is a `sample-input.txt` file to run.

## Output format

A *dot*-text-formatted graph to visualize the Boolean Network

See [Graphviz software](https://www.graphviz.org/) where *dot* format is documented.

## Visualization

1. Install [Graphiz](https://www.graphviz.org/download/);
2. Copy and paste, or pipe this program output to Graphviz input, then you'll be able to see the Boolean Network graph.

### Example. Steps for Linux OS

1. Install DOT graph viewer

```bash
sudo apt install xdot
```
2. Run this program (in this case inputting from `sample-input.txt`) then pipe it's ouput to xdot viewer

```bash
java -jar boolean-network.jar < sample-input.txt | xdot /dev/stdin
```
