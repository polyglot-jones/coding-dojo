
class SudokuSolver {
  def solve(puzzle: PuzzleGrid) = {
    for (row <- puzzle;
         cell <- row;
         column = puzzle map {
           r => r(row.indexOf(cell))
         }) {
      cell match {
        case FilledCell(_) =>
        case e: EmptyCell => {

        }

      }
    }
    val solution = puzzle.clone

    solution
  }
}

abstract sealed class Cell

case class FilledCell(value: Int) extends Cell

case class EmptyCell extends Cell

type PuzzleGrid = Vector[Vector[Cell]]