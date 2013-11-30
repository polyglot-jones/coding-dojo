import org.junit.runner.RunWith
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.junit.{AssertionsForJUnit, JUnitRunner}
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.mockito.Matchers._
import scala.collection.JavaConversions._

@RunWith(classOf[JUnitRunner])
class SudokuSolverTest extends FlatSpec with Matchers with MockitoSugar {

  val sudokuSolver = new SudokuSolver

  "SudokuSolver" should "solve a mini puzzle" in {

    val puzzle = Vector(
      Vector(EmptyCell,EmptyCell,FilledCell(1)),
      Vector(EmptyCell,FilledCell(2),EmptyCell),
      Vector(EmptyCell,EmptyCell,EmptyCell))
    val solution = sudokuSolver solve puzzle
    solution should be (Vector(
      Vector(FilledCell(2),FilledCell(3),FilledCell(1)),
      Vector(FilledCell(1),FilledCell(2),FilledCell(3)),
      Vector(FilledCell(3),FilledCell(1),FilledCell(2))))
  }

}

