package main

import "fmt"

func longestConsecutive(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	set := make(map[int]struct{})

	for _, num := range nums {
		set[num] = struct{}{}
	}

	maxCons := 0

	for num := range set {
		if _, ok := set[num-1]; !ok {
			count := 1
			for {
				if _, ok := set[num+count]; ok {
					count++
					continue
				}

				if count > maxCons {
					maxCons = count
				}
				break

			}
		}
	}
	return maxCons
}

func main() {
	nums := []int{100, 4, 200, 1, 3, 2}
	res := longestConsecutive(nums)
	fmt.Println(res)
}
