package brocchini.insertionsort

import org.scalatest.FlatSpec

/**
  * Created by mozart on 3/6/16.
  */
class InsertionSortSpec extends FlatSpec with InsertionSortBehaviors {

  def alreadySortedArray = {
    Array(1, 2, 4, 5, 6, 9, 10)
  }

  def invertedOrderArray = {
    Array(10, 9, 6, 5, 4, 2, 1)
  }

  def outOfOrderArray = {
    Array(9, 5, 6, 1, 10, 4, 2)
  }

  def someRepeated: Array[Int] = {
    Array(9, 5, 6, 1, 10, 5, 5)
  }

  def arrayAllRepeated: Array[Int] = {
    Array(5, 5, 5)
  }

  def just1 = {
    Array(4)
  }

  def javaSorter = {
    InsertSort.sorter
  }

  "InsertionSort sorting sorted array" should behave like sortRandomElements(alreadySortedArray, InsertionSort)
  "InsertionSort sorting inverted array" should behave like sortRandomElements(invertedOrderArray, InsertionSort)
  "InsertionSort sorting out of order array" should behave like sortRandomElements(outOfOrderArray, InsertionSort)
  "InsertionSort array of just 1 number" should behave like notChangeJust1Element(just1, InsertionSort)
  "InsertionSort array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, InsertionSort)

  "InsertionSort2 sorting sorted array" should behave like sortRandomElements(alreadySortedArray, InsertionSort2)
  "InsertionSort2 sorting inverted array" should behave like sortRandomElements(invertedOrderArray, InsertionSort2)
  "InsertionSort2 sorting out of order array" should behave like sortRandomElements(outOfOrderArray, InsertionSort2)
  "InsertionSort2 array of just 1 number" should behave like notChangeJust1Element(just1, InsertionSort2)
  "InsertionSort2 array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, InsertionSort2)

  "javaSorter sorted" should behave like sortRandomElements(alreadySortedArray, javaSorter)
  "javaSorter inverted" should behave like sortRandomElements(invertedOrderArray, javaSorter)
  "javaSorter sorting out of order array" should behave like sortRandomElements(outOfOrderArray, javaSorter)
  "javaSorter sorting array of just 1 number" should behave like notChangeJust1Element(just1, javaSorter)
  "javaSorter sorting array of all repeated numbers" should behave like notChangeAllRepeatedElements(arrayAllRepeated, javaSorter)
}
