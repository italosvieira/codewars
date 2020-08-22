export function getAverage(marks: number[]): number {
    return Math.floor(marks.reduce((p: number, c: number) => p + c, 0) / marks.length);
}
