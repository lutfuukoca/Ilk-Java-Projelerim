import turtle
import math

def heart(t):
    x = 16 * math.sin(t) ** 3
    y = (
        13 * math.cos(t)
        - 5 * math.cos(2 * t)
        - 2 * math.cos(3 * t)
        - math.cos(4 * t)
    )
    return x, y


screen = turtle.Screen()
screen.setup(600, 600)
screen.bgcolor("black")
screen.colormode(1)

pen = turtle.Turtle()
pen.speed(0)  # Fastest drawing
pen.hideturtle()
pen.width(0.001)

N = 140
K = 2.1
SCALE = 7

bright = (0.95, 0.15, 0.1)

for i in range(N):
    angle = 2 * math.pi * i / N
    hx, hy = heart(angle)
    hx *= SCALE
    hy *= SCALE

    ex, ey = hx * K, hy * K

    pen.penup()
    pen.goto(hx, hy)
    pen.pendown()
    pen.pencolor(bright)
    pen.goto(ex, ey)

turtle.done()