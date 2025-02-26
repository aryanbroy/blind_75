package main

import (
	"fmt"
	"math"
)

func maxArea(height []int) int {
	left := 0
	right := len(height) - 1

	max := 0

	for left < right {
		area := (right - left) * int(math.Min(float64(height[left]), float64(height[right])))

		if area > max {
			max = area
		}

		if height[left] > height[right] {
			right--
		} else {
			left++
		}
	}
	return max
}

func main() {
	height := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}
	res := maxArea(height)
	fmt.Println(res)
}
