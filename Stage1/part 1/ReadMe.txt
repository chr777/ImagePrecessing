So I have created a library with 3 staged photos. The first (x-1) represents the original photo,
the second(x-2) represents photos on which the Binary_Layer plugins are applied (the secuence is presented below)
|	        |		|
|binary-layer_0 | binary_layer_1|
|		|		|
|binary-layer_2 | binary-layer_3|
|		|		|
And the 3rd photo(x-3) represents the smoothened versions in the same order.

1-1 and 2-1 photos are the first attempts to create the sequence of usage of the filters.
In 1-3 I applied Gaussian(1) -> mean(3) -> max(3) -> median(3) *mean(3) means mean filter with radius 1 ...
In 2-3 I applied Gaussian(1) -> mean(3)  -> median(3) *mean(3) means mean filter with radius 1 ...
3-1 photo shows Standard Behavior.
In 3-3 I applied Gaussian(1) -> mean(3)  -> median(3) -> Gaussian(1) *mean(3) means mean filter with radius 1 ...
4-1 photo does not show Standard Behavior.
In 4-3 I applied Gaussian(1) -> mean(3)  -> median(3) -> Gaussian(1) *mean(3) means mean filter with radius 1 ...

Above listed results are my experiments,but the best resuluts I have got using filter median with radii 5 then applying the binary layer and in the end maximin with radii 1.
Series of 5_x show my results. Also 5-1 is showing standart behavior.



