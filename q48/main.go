package main

import "fmt"

func rotate(matrix [][]int) {

	n := len(matrix)

	for i := range n - 1 {
		for j := i + 1; j < n; j++ {
			matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
			// temp := matrix[i][j]
			// matrix[i][j] = matrix[j][i]
			// matrix[j][i] = temp
		}
	}

	for i := range n {
		for j := range n / 2 {
			matrix[i][j], matrix[i][n-1-j] = matrix[i][n-1-j], matrix[i][j]
		}
	}
}

func main() {
	matrix := [][]int{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	}

	rotate(matrix)

	fmt.Println(matrix)
}
