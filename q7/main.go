package main

import "fmt"

func countSubstrings(s string) int {
	var count int

	for i := range s {
		left := i
		right := i

		for left >= 0 && right < len(s) && s[left] == s[right] {
			count++
			left--
			right++
		}

		left = i
		right = i + 1

		for left >= 0 && right < len(s) && s[left] == s[right] {
			count++
			left--
			right++
		}
	}
	return count
}

func main() {
	s := "abc"
	res := countSubstrings(s)
	fmt.Println(res)
}
