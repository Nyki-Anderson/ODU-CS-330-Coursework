from __future__ import annotations

import copy
from typing import Self

from shapes.shape import FPT_FMT, STR_FMT, Shape


class Square(Shape):
    """
    A Rectangle with 4 Equal Sides
    """

    def __init__(self, side=1):
        """
        Construct a Square
        """

        self._side = side

    @property
    def name(self) -> str:
        """
        Provide read-only access to the name attribute.
        """

        return "Square"

    @property
    def side(self):
        return self._side

    @side.setter
    def side(self, some_value):
        self._side = some_value

    def area(self):
        """
        Compute the area
        """
        return self._side ** 2.0

    def perimeter(self):
        """
        Compute the perimeter
        """

        return 4 * self._side

    def __deepcopy__(self, memo) -> Square:
        """
        Return a new duplicate Shape
        """

        return Square(copy.deepcopy(self.side))

    def __str__(self):
        """
        Print the Square
        """

        return (STR_FMT.format("Name", self.name)
                + FPT_FMT.format("Side", self.side)
                + FPT_FMT.format("Perimeter", self.perimeter())
                + FPT_FMT.format("Area", self.area()))

    def __repr__(self):
        return f"Square(side={self.side})"
