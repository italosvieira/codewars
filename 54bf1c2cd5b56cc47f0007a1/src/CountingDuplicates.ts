export function duplicateCount(text: string): number {
    return new Set(text.toLowerCase().split("").filter((value: string, index: number, array: string[]) => index !== array.lastIndexOf(value))).size;
}
